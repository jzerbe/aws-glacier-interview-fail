/*
 * simple tree for "family tree" - has undetermined branching factor
 *
 * spouse was not specifically asked for
 *
 * can only do one traversal of family tree
 */
package com.vraidsys.interviews.aws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jzerbe
 */
public class FamilyTree2 {

    private String myFamilyMemberName = null;
    private String mySpouseName = null;
    private List<FamilyTree2> myChildren = null;
    private static Map<Integer, List<String>> myTreeTraversal = null;

    public FamilyTree2(final String theFamilyMemberName, final String theSpouseName,
            final List<FamilyTree2> theChildren) {
        myFamilyMemberName = theFamilyMemberName;
        mySpouseName = theSpouseName;
        myChildren = theChildren;
    }

    public String getFamilyMemberName() {
        return myFamilyMemberName;
    }

    public String getSpouseName() {
        return mySpouseName;
    }

    public List<FamilyTree2> getChildren() {
        return myChildren;
    }

    private void addToCurrentLevelList(final int theCurrentDepth,
            final String theFamilyMemberName) {
        if (FamilyTree2.myTreeTraversal.get(theCurrentDepth) == null) {
            FamilyTree2.myTreeTraversal.put(theCurrentDepth, new ArrayList<String>());
            // only ever going to be adding to List, hence ArrayList
        }

        FamilyTree2.myTreeTraversal.get(theCurrentDepth).add(theFamilyMemberName);
    }

    protected void traverseFamilyTree(final int theCurrentDepth) {
        if ((FamilyTree2.myTreeTraversal == null) && (theCurrentDepth == 0)) {
            FamilyTree2.myTreeTraversal = new HashMap<>();
        } else if ((FamilyTree2.myTreeTraversal != null) && (theCurrentDepth == 0)) {
            return; //do not traverse the tree again, this is read-only obj
        }

        this.addToCurrentLevelList(theCurrentDepth, myFamilyMemberName);
        if (myChildren != null) {
            for (FamilyTree2 aFamilyTree : myChildren) {
                aFamilyTree.traverseFamilyTree((theCurrentDepth + 1));
            }
        }
    }

    public void printFamilyTree() {
        this.traverseFamilyTree(0); //be sure the tree has been traversed

        for (int theDepth : myTreeTraversal.keySet()) {
            if (myTreeTraversal.get(theDepth) != null) {
                System.out.println("depth = " + String.valueOf(theDepth));

                for (String aFamilyMemberName : myTreeTraversal.get(theDepth)) {
                    System.out.println(aFamilyMemberName);
                }

                System.out.println();
            }
        }
    }
}
