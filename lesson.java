class Triangle{
    String str;
    Triangle(String str){
        this.str = str;
    }
    void Trngl(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(str);
            }
            System.out.println();
        }
    }
}

class lesson{
    public static void main(String args[]){
        Triangle myTriangle = new Triangle("s");
        myTriangle.Trngl();
    }
}
