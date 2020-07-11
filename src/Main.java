public class Main {

    public static void main(String[] args) {

        short[] b = new short[10];
        for (int i = 9; i >= 1; i--) {
            b[i] = (short) (i*2);//заполнение массива четными числами от 2 до 18 в порядке убывания
        }

        float[] x = new float[18];
        for (int i = 0; i < 18; i++) {
            x[i] = ((float) (Math.random()*29 - 13));//заполнение массива 18-ью рандомными числами в диапазоне от -13.0 до 15.0
        }

        double[][] c = new double[9][18];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 18; j++) {
                double asin = Math.asin((x[j] + 1) / 28);
                if (b[i] == 18) {
                    c[i][j] = asin;
                }
                else if (b[i] == 2 || b[i] == 6 || b[i] == 12 || b[i] == 14) {
                    c[i][j] = (Math.log10(Math.cos(x[j])))*(Math.log10(Math.acos((x[j]+1)/28))+1);
                }
                else {
                    c[i][j] = Math.pow(Math.E, Math.pow(3/ asin, asin))*(2+Math.pow(Math.cos(Math.atan((x[j]+1)/28)), (double) 1/3));
                }

                System.out.printf("%10.3f", c[i][j]);//вывод массива с формате с тремя знаками после запятой
            }
            System.out.println();
        }
    }

}
