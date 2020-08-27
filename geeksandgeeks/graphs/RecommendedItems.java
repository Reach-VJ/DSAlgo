package com.reachingskies.geeksandgeeks.graphs;

import java.util.*;

public class RecommendedItems {

    public static void main(String [] args) {

        List<PairString> listOfPairs = new ArrayList<>();
        listOfPairs.add(new PairString("Item1","Item2"));
        listOfPairs.add((new PairString("Item3","Item4")));
        listOfPairs.add(new PairString("Item4","item5"));

        RecommendedItems items = new RecommendedItems();
        List<String> listOfItems = items.largestItemAsso(listOfPairs);
        System.out.println("List of items : "+ listOfItems);
    }

    List<String> largestItemAsso(List<PairString> items) {

        Map<String,Integer> map = new HashMap<>();

        int i = 0;
        for(PairString pairString : items) {
            if(!map.containsKey(pairString.getMainItem()))
                map.put(pairString.getMainItem(),i++);
            if(!map.containsKey(pairString.getRecommendedItem()))
                map.put(pairString.getRecommendedItem(),i++);
        }

        System.out.println(map);

        List<List<Integer>> adjList = getAdjList(items,map);

        List<Integer> maxSize = adjList.get(0);
        int k = 0;

        for(int j = 0; j < adjList.size(); j++) {
            if(maxSize.size() < adjList.get(j).size()) {
                maxSize = adjList.get(j);
                k = j;
            }
        }

        maxSize.add(k);
        List<String> listOfItems = new ArrayList<>();

        for(int p : maxSize) {
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() == p) {
                    listOfItems.add(entry.getKey());
                }
            }
        }
        return listOfItems;
    }

    List<List<Integer>> getAdjList(List<PairString> list, Map<String,Integer> map) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < map.size(); i++) {
            adjList.add(new ArrayList<>());
        }

        for(PairString pair : list) {
            addEdge(adjList,pair,map);
        }

        return adjList;
    }

    void addEdge(List<List<Integer>> adjList, PairString pair, Map<String,Integer> map) {
        adjList.get(map.get(pair.getMainItem())).add(map.get(pair.getRecommendedItem()));
        adjList.get(map.get(pair.getRecommendedItem())).add(map.get(pair.getMainItem()));
    }

}

class PairString {
    public String getMainItem() {
        return mainItem;
    }

    public void setMainItem(String mainItem) {
        this.mainItem = mainItem;
    }

    public String getRecommendedItem() {
        return recommendedItem;
    }

    public void setRecommendedItem(String recommendedItem) {
        this.recommendedItem = recommendedItem;
    }

    public PairString(String mainItem, String recommendedItem) {
        this.mainItem = mainItem;
        this.recommendedItem = recommendedItem;
    }

    private String mainItem;
    private String recommendedItem;


}
