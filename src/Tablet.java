public class Tablet extends TV{
    private boolean isStills;

    public Tablet(String matrix, int diagonal, boolean isStills){
        super(matrix, diagonal);
        setStills(isStills);
        getStills();

    }
    protected void setStills(boolean stills) {
        isStills = stills;
    }

    protected void getStills() {
        if (isStills){
            System.out.println("В комплекте есть стилус");
        }else {
            System.out.println("В комплекте нет стилуса");
        }
    }
}
