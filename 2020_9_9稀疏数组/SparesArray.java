public class SparesArray {
    public static void main(String[] args) {
        int OriginalArray [][] = new int[10][10];
        OriginalArray [1][2] = 1;
        OriginalArray [2][3] = 2;
        //打印原始数组
        for(int[] row : OriginalArray){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.printf("\n");
        }
        System.out.println("--------------------------------------------------------");
        //创建稀疏数组
        //1.先找到原始数组的有效值个数
        int sum = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j< 10; j++){
                if(OriginalArray[i][j] != 0){
                    sum++;
                }
            }
        }
        //2.创建稀疏数组
        int SparesArray[][] = new int[sum + 1][3];
        SparesArray[0][0] = 10;
        SparesArray[0][1] = 10;
        SparesArray[0][2] = sum;
        //3.将原始数组的有效值放到稀疏数组里面
        int count = 0;//记录第几行有有效值
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(OriginalArray[i][j] != 0){
                    count++;
                    SparesArray[count][0] = i;
                    SparesArray[count][1] = j;
                    SparesArray[count][2] = OriginalArray[i][j];
                }
            }
        }
        //4.打印稀疏数组
        for(int i = 0; i < sum + 1; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d\t", SparesArray[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("--------------------------------------------------------");
        //将稀疏数组恢复成正常数组
        int array [][] = new int [SparesArray[0][0]][SparesArray[0][1]];
        for(int i = 1; i < sum + 1; i++){
            array[SparesArray[i][0]][SparesArray[i][1]] = SparesArray[i][2];
        }
        for(int[] row : array){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.printf("\n");
        }
    }
}