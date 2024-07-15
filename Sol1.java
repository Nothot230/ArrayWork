import java.util.Random;

public class Sol1 {
    static int[][] A = new int[7][5];////สร้างArray 2 มิติ
    static String[] rowName = {"Row1: ","Row2: ","Sum: ","Minus: ","Multi: ","Div: ","Modulo: "};////ตั้งชื่อแถว

    public int[][] swap(int[][] A){////Method สำหรับสลับในกรณีที่ค่าในแถวที่ 1 น้อยกว่าแถวที่ 2
        int temp = 0;
        for(int i=0;i<A[0].length;i++){
            if(A[0][i] < A[1][i]){
                temp = A[0][i];
                A[0][i] = A[1][i];
                A[1][i] = temp;
            }
        }
        return A;
    }


    public void display(int[][] A){//// Method แสดง Array ที่่สุ่มมา 2 แถว
        for(int i = 0;i<A.length-5;i++){
            System.out.println();
            System.out.print(rowName[i]);
          for(int j = 0;j<A[i].length;j++){
              System.out.print(A[i][j]+" ");
          }
        }
    }
    
    public void sum(int[][] A){//// Method บวกแถวที่ 1 กับแถวที่ 2
        for(int i=0;i<A[i].length;i++){
            A[2][i] = A[0][i] + A[1][i];
        }
        System.out.print("\n"+rowName[2]);   
        for(int i = 0;i<A[2].length;i++){
            System.out.print(A[2][i]+" ");
        }
        System.out.println();
        
    }

    public void minus(int[][] A){//// Method ลบแถวที่ 1 กับแถวที่ 2
        for(int i=0;i<A[i].length;i++){
            A[3][i] = A[0][i] - A[1][i];
        }
        System.out.print(rowName[3]);   
        for(int i = 0;i<A[2].length;i++){
            System.out.print(A[3][i]+" ");
        }
        System.out.println();
           
    }

    public void multi(int[][] A){//// Method คูณแถวที่ 1 กับแถวที่ 2
        for(int i=0;i<A[i].length;i++){
            A[4][i] = A[0][i] * A[1][i];
        }
        System.out.print(rowName[4]);   
        for(int i = 0;i<A[4].length;i++){
            System.out.print(A[4][i]+" ");
        }
        System.out.println();
    }

    public void div(int[][] A){//// Method หารแถวที่ 1 กับแถวที่ 2
        swap(A);
        for(int i=0;i<A[i].length;i++){
            A[5][i] = A[0][i] / A[1][i];
        }
        System.out.print(rowName[5]); 
        for(int i = 0;i<A[4].length;i++){
            System.out.print(A[5][i]+" ");
        }
        System.out.println();
    }

    public void mod(int[][] A){//// Method หารเอาเศษแถวที่ 1 กับแถวที่ 2
        swap(A);
        for(int i=0;i<A[i].length;i++){
            A[6][i] = A[0][i] % A[1][i];
        }
        System.out.print(rowName[6]); 
        for(int i = 0;i<A[4].length;i++){
            System.out.print(A[6][i]+" ");
        }
        System.out.println();
    }

    
    
    public static void main(String[] args){
        Random rnd = new Random();

        for(int i = 0;i < A.length-5;i++){
            for(int j = 0;j < A[i].length; j++ ){
                A[i][j] = rnd.nextInt(1, 100);///สุ่มค่าในArray 1-100
            }
            
        }
        Sol1 sol = new Sol1();
        sol.display(A);///เรียกใช้้
        sol.sum(A);///เรียกใช้้
        sol.minus(A);///เรียกใช้้
        sol.multi(A);///เรียกใช้้
        sol.div(A);///เรียกใช้้
        sol.mod(A);///เรียกใช้้
    }
    
}
