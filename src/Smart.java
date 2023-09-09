public class Smart extends TV {
    private String OS;
    public Smart(int diagonal, String matrix, float price, int[] size, String OS){
        super(diagonal, matrix, price, size);
        setValues(diagonal,matrix,price,size);
        System.out.println(getValues());
    }

    protected void setValues(int diagonal, String matrix, float price, int[] size, String OS) {
        super.setValues(diagonal, matrix, price, size);
        this.OS = OS;
    }

    @Override
    protected String getValues(){
        return super.getValues() + "\n" +"OS: " + this.OS;
    }
}
