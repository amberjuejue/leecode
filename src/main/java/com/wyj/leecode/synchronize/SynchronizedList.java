package com.wyj.leecode.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wangyujue
 */
public class SynchronizedList {
    public static void main(String[] args) {
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        list.add(1);
        list.contains(1);
    }
}
