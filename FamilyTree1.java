
public void printFamilyTree(final FamilyTree theFamilyTree) {
    int aDepthCounter = 0;
    boolean moreMembers = true;
    // start with oldest anscestor, and progressively get younger memebers of family
    while (moreMembers) {
        List<TreeNode> aListOfFamily = getAllTreeNodesAtDepth(aDepthCounter);

        System.out.println("the depth = "+String.valueOf(i));
        for (TreeNode aFamilyMember : aListOfFamily) {
            System.out.println(aFamilyMember.getName());
        }

        aDepthCounter++;
    }
}

private List<TreeNode> getAllTreeNodesAtDepth(FamilyTree theFamilyTree, int theTreeDepth) {
    if (theTreeDepth <= 0) {
        return theFamilyTree.getRoot(); //stop the recursion at specified depth
    } else {
        List<FamilyTree> aSubTreeList = theFamilyTree.getChildren();
        if (aSubTreeList == null) { //no children (youngest member of family on branch)
            return null;
        } else { //more members of the family
            for (FamilyTree aSubFamilyTree : aSubTreeList) {
                getAllTreeNodesAtDepth(aSubFamilyTree, (theTreeDepth - 1));
            }
        }
    }
}
