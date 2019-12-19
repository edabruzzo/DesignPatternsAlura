package chainOfResponsibilityExercise;

public class FormatoXML implements Formato {

    Formato proximo = null;

	@Override
	public void formataDadosConta(Conta conta, String formato) {


        if(formato != null && conta != null){

                if(proximo != null && formato.equalsIgnoreCase("XML")){

                    System.out.println("<conta>"+
                    "<titular>"+conta.getNomeTitular+"</titular>"+
                    "<saldo>"+conta.getSaldo()+"</saldo>"+
                    "</conta>");

                }else if (proximo != null){

                    proximo.formataDadosConta(conta, formato);

                }else{

                    System.out.println("Não foi possível formatar os dados da conta");
                }


        }

		
	}

    
    
    
}