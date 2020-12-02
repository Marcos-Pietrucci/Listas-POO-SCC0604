
package ex3;
import java.util.Random;

public class Ex3 {

   
    public static void main(String[] args) {
       
        
        
        //Variáveis comuns
        int nCores = Runtime.getRuntime().availableProcessors(); // Tenho 12 Cores
        long numero_calculos = 10000000L;
        Random ra = new Random();
        double num;
        long i;
        long t, num_long = 0;
        
        //Operação SQRT Serial
        t = System.currentTimeMillis();
        for(i = 0; i < numero_calculos; i++)
        {
            num = 1 + 99*ra.nextDouble();
            Math.sqrt(num);
            //System.out.println(i);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Serial SQRT)Demorou: " + t + " mili-segundos");
        /******************************************/
        
        //Operação SQRT Paralela
        Thread t1 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t2 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t3 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t4 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t5 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t6 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t7 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t8 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t9 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t10 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t11 = new Thread(new SqrtParalela(nCores, numero_calculos));
        Thread t12 = new Thread(new SqrtParalela(nCores, numero_calculos));
        
        t = System.currentTimeMillis();
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
       
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            t11.join();
            t12.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Paralelo SQRT)Demorou: " + t + " mili-segundos\n");
        /******************************************/
                
        //Operações Simples Serial
        t = System.currentTimeMillis();
        for(i = 0; i < numero_calculos; i++)
        {
            num_long++;
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Serial simples)Demorou: " + t + " mili-segundos");
        /******************************************/
        
        //Operação Simples Paralela
        t1 = new Thread(new SomaParalela(nCores, numero_calculos));
        t2 = new Thread(new SomaParalela(nCores, numero_calculos));
        t3 = new Thread(new SomaParalela(nCores, numero_calculos));
        t4 = new Thread(new SomaParalela(nCores, numero_calculos));
        t5 = new Thread(new SomaParalela(nCores, numero_calculos));
        t6 = new Thread(new SomaParalela(nCores, numero_calculos));
        t7 = new Thread(new SomaParalela(nCores, numero_calculos));
        t8 = new Thread(new SomaParalela(nCores, numero_calculos));
        t9 = new Thread(new SomaParalela(nCores, numero_calculos));
        t10 = new Thread(new SomaParalela(nCores, numero_calculos));
        t11 = new Thread(new SomaParalela(nCores, numero_calculos));
        t12 = new Thread(new SomaParalela(nCores, numero_calculos));
        
        t = System.currentTimeMillis();
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
       
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            t11.join();
            t12.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Paralelo simples)Demorou: " + t + " mili-segundos\n");
        /******************************************/
        
        //Operação POW serial - Quadrado de um número
        t = System.currentTimeMillis();
        for(i = 0; i < numero_calculos; i++)
        {
            num = 1 + 99*ra.nextDouble();
            Math.pow(num, 2);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Serial POW)Demorou: " + t + " mili-segundos");
        /**********************************************/
        
        //Operação POW paralela - Quadrado de um número
        t1 = new Thread(new PowParalela(nCores, numero_calculos));
        t2 = new Thread(new PowParalela(nCores, numero_calculos));
        t3 = new Thread(new PowParalela(nCores, numero_calculos));
        t4 = new Thread(new PowParalela(nCores, numero_calculos));
        t5 = new Thread(new PowParalela(nCores, numero_calculos));
        t6 = new Thread(new PowParalela(nCores, numero_calculos));
        t7 = new Thread(new PowParalela(nCores, numero_calculos));
        t8 = new Thread(new PowParalela(nCores, numero_calculos));
        t9 = new Thread(new PowParalela(nCores, numero_calculos));
        t10 = new Thread(new PowParalela(nCores, numero_calculos));
        t11 = new Thread(new PowParalela(nCores, numero_calculos));
        t12 = new Thread(new PowParalela(nCores, numero_calculos));
        
        t = System.currentTimeMillis();
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
       
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            t11.join();
            t12.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Paralelo POW)Demorou: " + t + " mili-segundos\n");
        /******************************************/
        
        //Operação Cosseno Serial
        t = System.currentTimeMillis();
        for(i = 0; i < numero_calculos; i++)
        {
            num = 1 + 99*ra.nextDouble();
            Math.cos(num);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Serial COS)Demorou: " + t + " mili-segundos");
        /******************************************/
        
        //Operação Cosseno paralela
        t1 = new Thread(new CosParalela(nCores, numero_calculos));
        t2 = new Thread(new CosParalela(nCores, numero_calculos));
        t3 = new Thread(new CosParalela(nCores, numero_calculos));
        t4 = new Thread(new CosParalela(nCores, numero_calculos));
        t5 = new Thread(new CosParalela(nCores, numero_calculos));
        t6 = new Thread(new CosParalela(nCores, numero_calculos));
        t7 = new Thread(new CosParalela(nCores, numero_calculos));
        t8 = new Thread(new CosParalela(nCores, numero_calculos));
        t9 = new Thread(new CosParalela(nCores, numero_calculos));
        t10 = new Thread(new CosParalela(nCores, numero_calculos));
        t11 = new Thread(new CosParalela(nCores, numero_calculos));
        t12 = new Thread(new CosParalela(nCores, numero_calculos));
        
        t = System.currentTimeMillis();
    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
       
       
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            t11.join();
            t12.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        t = System.currentTimeMillis() - t;
        System.out.println("(Paralelo COS)Demorou: " + t + " mili-segundos\n");

    }
    
}
