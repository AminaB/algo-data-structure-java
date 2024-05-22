import java.util.Arrays;

public class HotelRoom {
    public static int[] allocateCustomers(int[][] customers){
        int [] rooms= new int[customers.length];
        rooms[0]=1;
        int roomnb=1;
        int i=0;
        for(int j=1; j<customers.length; j++){
            //System.out.println(Arrays.toString(customers[j]));
            if(canShare(customers[i],customers[j]) ){
                rooms[j]=rooms[i];
                if (j+1<customers.length && canShare(customers[j],customers[j+1])){
                    rooms[j+1]=rooms[i];
                    j++;
                }else if(j+1<customers.length){
                    for(int k=0; k<customers.length; k++) {
                        if(k!=j+1){
                            if(canShare(customers[j+1], customers[k]) && rooms[k]!= rooms[i]){
                                rooms[j+1]=rooms[k];
                                j++; break;
                            }
                        }
                    }
                }
            }else if(rooms[i]!=0 && rooms[j]!=0 && rooms[i]!= rooms[j]){

            }else{
                roomnb++;
                rooms[j]=roomnb;
            }
        }
        return rooms;
    }
    public static boolean canShare(int[] t1, int[] t2){
        return t2[0] > t1[1] || t1[0] > t2[1];
    }

    public static void main(String[] args) {
        int [][]input= new int[][]{{1,5}, {2,4},{6,8},{7,7}};
        System.out.println(Arrays.toString(allocateCustomers(input)));
    }
}

//        for(int i=0; i<customers.length; i++){
//            if(i==0) {
//                rooms[i] = 1;
//            }
//            for(int j=i+1; j<customers.length; j++){
//                    //System.out.println(Arrays.toString(customers[j]));
//                    if(canShare(customers[i],customers[j]) ){
//                        rooms[j]=rooms[i];
//                        if (j+1<customers.length && canShare(customers[j],customers[j+1])){
//                            rooms[j+1]=rooms[i];
//                            j++;
//                        }else if(j+1<customers.length){
//                            for(int k=0; k<customers.length; k++) {
//                                if(k!=j+1){
//                                    if(canShare(customers[j+1], customers[k]) && rooms[k]!= rooms[i]){
//                                        rooms[j+1]=rooms[k];
//                                        j++; break;
//                                    }
//                                }
//                            }
//                        }
//                    }else if(rooms[i]!=0 && rooms[j]!=0 && rooms[i]!= rooms[j]){
//
//                    }else{
//                        roomnb++;
//                        rooms[j]=roomnb;
//                    }
//
//            }

       // }

