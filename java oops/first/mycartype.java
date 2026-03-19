package first;

class mycartype {
    String color;
    String name;
    public mycartype(String color, String name){
        this.color=color;
        this.name=name;
    }

    public void drive(){
        System.out.println("my car is drive");
        System.out.println("my car color is: "+color);
        System.out.println("my car name is: "+name);
    }
    public void change(String color){
        this.color=color;
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}
