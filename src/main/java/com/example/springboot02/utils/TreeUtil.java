package com.example.springboot02.utils;






import java.util.ArrayList;
import java.util.List;

/**
 * layuimini的动态菜单栏初始化时所需的Tree构建工具
 */
public class TreeUtil {
//    public static List<Menu> toTree(List<Menu> treeList, Integer pid) {
//        List<Menu> retList = new ArrayList<>();
//        for (Menu parent : treeList) {
//            if (pid==parent.getPid()) {
//                retList.add(findChildren(parent, treeList));
//            }
//        }
//        return retList;
//    }
//    private static Menu findChildren(Menu parent, List<Menu> treeList) {
//        for (Menu child : treeList) {
//            if (parent.getId()==child.getPid()) {
//                if (parent.getChild() == null) {
//                    parent.setChild(new ArrayList<Menu>());
//                }
//                parent.getChild().add(findChildren(child, treeList));
//            }
//        }
//        return parent;
//    }


}
