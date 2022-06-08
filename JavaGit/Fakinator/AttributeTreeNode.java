public class AttributeTreeNode{
    
    private String attribute;
    private AttributeTreeNode yes;
    private AttributeTreeNode no;

    //Creates character node
    public AttributeTreeNode(String attribute){
        this.attribute = attribute;
        this.yes = null;
        this.no =  null;
    }

    //Creates question node
    public AttributeTreeNode(String attribute, AttributeTreeNode yes, AttributeTreeNode no){
        this.attribute = attribute;
        this.yes = yes;
        this.no = no;
    }

    public String getAttribute(){
        return attribute;
    }

    public AttributeTreeNode getYes(){
        return yes;
    }

    public AttributeTreeNode getNo(){
        return no;
    }

}
