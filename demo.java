class demo extends Thread{
    public int count = 5;
    private static int Tcount = 0;
    demo(){
        super(""+ ++Tcount);
        start();
    }
    public void run(){
        while(true){
            System.out.println("#"+getName()+":"+count);
            if(--count == 0) return;
            yield();
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            new demo();
        }
    }
}
