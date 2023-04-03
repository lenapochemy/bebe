public enum Color {
    WHITE("WHITE"),
    RED("RED"),
    BROWN("BROWN"),
    DEFAULT_COLOR("default color");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public static void getAllValues(){
        System.out.println(Color.WHITE + ", " + Color.RED + ", " +Color.BROWN);
    }

    @Override
    public String toString(){
        return color;
    }

}
