public class Inheritance {


    public static void main(String ...args) {
        TV tv= new TV();
        tv.changeChannel();
        tv.switchON();
        SmartTV st= new SmartTV();
        st.switchON();
        st.browse();
        TV st2= new SmartTV();
        st2.changeChannel();


    }
}
  class TV{
    public void switchON(){
        System.out.println("TV switch on");
    }
     public void changeChannel(){
         System.out.println("TV is changed");
     }


 }
class SmartTV extends TV{
    @Override
    public void switchON(){
        System.out.println("Smart TV switch on");
    }
    @Override
    public void changeChannel(){
        System.out.println("Smart TV is changed");
    }
    public void browse(){
        System.out.println("Smart TV is browsing");
    }
}