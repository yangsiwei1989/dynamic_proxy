package meiju1;

public enum Color {
    RED("红色",1),GREEN("绿色",2),BLACK("黑色",3),YELLO("黄色",4);
    private String name;
    private int index;

    //构造方法
    private Color(String name,int index){
        this.name = name;
        this.index = index;
    }

    public String getName(){
        return name;
    }

    public int getIndex(){
        return index;
    }
    //覆盖方法
    @Override
    public String toString(){
        return this.index+"_"+this.name;
    }

}
