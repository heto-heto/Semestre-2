package P1_Banco;

public class CuentaBancaria {
        //1. Crea clase
        //2. Definir los atributos
        int numCuenta=0, cvv=0;
        String nameCliente;
        float saldo=0;
        //3. Definir el constructor
        //uno es atributo y otro es varible
        public CuentaBancaria(int numC, String nameC, int codcvv, float saldo){
            this.numCuenta = numC; //izq lo qu esta en public class y derch enen public
            this.nameCliente = nameC;
            this.cvv = codcvv; 
            this.saldo = saldo;  
        }

        //Metodos
        @Override
        public String toString(){
          return "CuentaBancaria{" + "numCuenta=" + numCuenta + ", cvv="+cvv+", nameCliente="+nameCliente+", saldo="+saldo+"}";
        }
        //poner valores
        public int getNumCuenta(){
          return numCuenta;
        }

        public void setNumCuenta(int numCuenta){
          this.numCuenta = numCuenta;

        }

        public int getCvv(){
          return cvv;
        }

        public void setCvv(){
          this.cvv = cvv;
        }

        public String getNameCliente(){
          return nameCliente;
        }
        public void setNamecliente(String nameCliente){
          this.nameCliente=nameCliente;
        }
        public float Mostrar_Saldo(){
          // System.out.println("Su saldo actual es de: "+saldo);
          return saldo;
        }

        void Depoositar(float cantidad){
          saldo += cantidad;
        }

        // public void Depositar(){
        //     @SuppressWarnings("resource")
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Dinero a despositar: ");
        //     float depo=sc.nextInt();
        //     saldo=saldo+depo;
        //     System.out.println("Saldo total: "+saldo);
        //   }

          //Retirar más la condicional de salo inexistente
          void Retirar(float cantidad){
            if(HaySaldo(cantidad)){
              saldo=saldo-cantidad;
            }else{
              System.out.println("Saldo insuficiente");
            }
          }

          boolean HaySaldo(double cantidad){
            if(saldo>=cantidad){
              return true;
            }else{
              return false;
            }
          }
}
        /*public void Retirar(){
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.print("Dinero a retirar: ");
            float retirar=sc.nextInt();
            if(HaySaldo(retirar)){
            saldo=saldo-retirar;
            System.out.println("Saldo total: "+saldo);
          }else{
            System.out.println("Saldo insuficiente.");
          */

        // Por si tiene saldo insuficiente, mostrar tal mensaje
        

       
  

    
