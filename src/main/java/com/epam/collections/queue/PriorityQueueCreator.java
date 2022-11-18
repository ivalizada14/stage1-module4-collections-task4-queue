package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
class StringComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> pq = new PriorityQueue<>(new StringComparator());
        pq.addAll(firstList); pq.addAll(secondList);
        return pq;
    }
}
