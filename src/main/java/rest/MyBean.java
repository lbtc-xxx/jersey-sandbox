package rest;

public class MyBean {

    public String getFoo() {
        return "foo";
    }

    public String getHoge(){
        return "hoge";
    }

    public MyEnclosedBean getMyEnclosedBean(){
        return new MyEnclosedBean();
    }
}
