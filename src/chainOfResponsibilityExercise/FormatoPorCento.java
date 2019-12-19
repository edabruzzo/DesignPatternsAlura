package chainOfResponsibilityExercise;

public class FormatoPorCento implements Formato {

    Formato proximo = null;

	@Override
	public void formataDadosConta(Conta conta, String formato) {


        if(formato != null && conta != null){

                if(proximo != null && formato.equalsIgnoreCase("%")){

                    System.out.println("titular%saldo\n"
                    +conta.getNomeTitular+"%"+
                    conta.getSaldo()+"\n");

                }else if (proximo != null){

                    proximo.formataDadosConta(conta, formato);

                }else{

                    System.out.println("Não foi possível formatar os dados da conta");
                }


        }

		
	}

    
    
    
}