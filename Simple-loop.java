class Untitled{
    public static void main(String arg[]){
        int [] intList = new int[10];
        for(int i = 0; i < intList.length; i++){
            intList[i] = i * i * i;
        }
        for(int i = 0; i < intList.length; i++){
            System.out.println(intList[i]);
        }
    }
}
