/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import chainOfResponsibility.*;
import chainOfResponsibilityExercise.*;
import flyweight.Nota;
import flyweight.NotasMusicais;
import flyweight.Piano;
import strategy.*;
import templateMethod.*;
import templateMethodRelatorio.*;
import java.util.*;
import builder.*;
import observer.*;
/**

FAZ PARTE DO CURSO DA ALURA, DISPONÍVEL EM 
https://github.com/alura-cursos/Design-Patterns-Java-I-Boas-pr-ticas-de-programa-o/blob/master/src/FiltroMesmoMes.java


IMPLEMENTAÇÕES BASEADAS NO CURSO, PORÉM DIFERENTES
 * @author Emm
 */
public class DesignPatternsAlura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DesignPatternsAlura.testarStrategy();
        DesignPatternsAlura.testarChainOfResponsibility();
        DesignPatternsAlura.testarChainOfResponsibilityExercise();
        DesignPatternsAlura.testarTemplateMethod();
        DesignPatternsAlura.testarTemplateMethodRelatorio();
        DesignPatternsAlura.testarDecorator();
        DesignPatternsAlura.testarEstadosVariamState();
        DesignPatternsAlura.testarBuilder();
        DesignPatternsAlura.testarObserver();
        DesignPatternsAlura.testarFlyWeight();

    
    }


    private static void testarFlyWeight(){
    
        NotasMusicais notas = new NotasMusicais();
        
        List<Nota> listaNotas = new ArrayList<Nota>();
        
        listaNotas.add(notas.getNota("do"));
        listaNotas.add(notas.getNota("doSustenido"));
        listaNotas.add(notas.getNota("re"));
        listaNotas.add(notas.getNota("reSustenido"));
        listaNotas.add(notas.getNota("mi"));
        listaNotas.add(notas.getNota("fa"));
        listaNotas.add(notas.getNota("faSustenido"));
        listaNotas.add(notas.getNota("fa"));
        listaNotas.add(notas.getNota("fa"));

        listaNotas.add(notas.getNota("do"));
        listaNotas.add(notas.getNota("ré"));
        listaNotas.add(notas.getNota("do"));
        listaNotas.add(notas.getNota("ré"));
        listaNotas.add(notas.getNota("ré"));
        listaNotas.add(notas.getNota("ré"));

        new Piano().toca(listaNotas);
        
    }

    private static void testarObserver(){

        Orcamento orcamento = new Orcamento();
        Item item = new Item();
        item.setNome("Guitarra");
        item.setValor(500);
        
        orcamento.getItens().add(item);
        
        double valorFinalOrcamento = 0;

        for (Item itemOrcamento : orcamento.getItens()){

            valorFinalOrcamento += itemOrcamento.getValor();

        }

        orcamento.setValor(valorFinalOrcamento);

        
        List<AcaoAposGerarNota> listaAcoesAposGerarNota = new ArrayList<AcaoAposGerarNota>();
        listaAcoesAposGerarNota.add(new EnviarEmail());
        listaAcoesAposGerarNota.add(new PersistirNotaBancoDados());
        listaAcoesAposGerarNota.add(new MultiplicadorValorNota(2));

        NotaFiscalBuilder builderNotaFiscal = new NotaFiscalBuilder(listaAcoesAposGerarNota);
        

        NotaFiscal notaFiscal = builderNotaFiscal.notaComRazaoSocial("xxxxxxxxxxx")
                                                        .notaComCNPJ("cnpj")    
                                                        .notaComData(Calendar.getInstance())                                
                                                        .notaComImposto(orcamento)                    
                                                        .notaComObservacao("XXXXXXXXXX")
                                                        .notaComOrcamento(orcamento)                    
                                                        .notaComValorBruto(orcamento)
                                                        .montaNota();

    }   







    private static void testarBuilder(){

        Orcamento orcamento = new Orcamento();
        Item item = new Item();
        item.setNome("Guitarra");
        item.setValor(500);
        
        orcamento.getItens().add(item);
        
        double valorFinalOrcamento = 0;

        for (Item itemOrcamento : orcamento.getItens()){

            valorFinalOrcamento += itemOrcamento.getValor();

        }

        orcamento.setValor(valorFinalOrcamento);



        NotaFiscal notaFiscal = new NotaFiscalBuilder().notaComRazaoSocial("xxxxxxxxxxx")
                                                        .notaComCNPJ("cnpj")    
                                                        .notaComData(Calendar.getInstance())                                
                                                        .notaComImposto(orcamento)                    
                                                        .notaComObservacao("XXXXXXXXXX")
                                                        .notaComOrcamento(orcamento)                    
                                                        .notaComValorBruto(orcamento)
                                                        .montaNota();

    }   








    private static void testarEstadosVariamState(){

        Orcamento orcamento = new Orcamento();
        Item item = new Item();
        item.setNome("Guitarra");
        item.setValor(500);
        
        orcamento.getItens().add(item);
        
        double valorFinalOrcamento = 0;

        for (Item itemOrcamento : orcamento.getItens()){

            valorFinalOrcamento += itemOrcamento.getValor();

        }

        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor());
        orcamento.aprova();

        orcamento.aplicaDescontoExtra();
        System.out.println(orcamento.getValor());

        orcamento.finaliza();

         // reforma.aplicaDescontoExtra(); lancaria excecao, pois não pode dar desconto nesse estado
        // reforma.aprova(); lança exceção, pois não pode ir para aprovado

    }


    private static void testarDecorator(){

        Imposto impostoX = new ImpostoX();
        Imposto impostoY = new  ImpostoY(impostoX);
        Imposto impostoMuitoAlto = new ImpostoMuitoAlto(impostoY);

        Orcamento orcamento = new Orcamento();

        Item item = new Item();
        item.setNome("Tumbadora");
        item.setValor(500);
        orcamento.getItens().add(item);

        double valorImpostoX = impostoX.calcula(orcamento);
        double valorImpostoXComImpostoY = impostoY.calcula(orcamento);
        double valorImpostoMuitoAltoCompostoImpostoY = impostoMuitoAlto.calcula(orcamento);


        System.out.println(valorImpostoX);
        System.out.println(valorImpostoXComImpostoY);
        System.out.println(valorImpostoMuitoAltoCompostoImpostoY);

    }




    private static void testarTemplateMethodRelatorio(){

        RelatorioComplexo relatorioComp = new RelatorioComplexo();
        RelatorioSimples relatorioSimp = new RelatorioSimples();

        Conta conta = new Conta();
        conta.setAgencia("XXXXXXXX");
        conta.setNomeTitular("Fulano");
        conta.setNumero("YYYYYYYYYYY");
        conta.setSaldo(10000);

        Conta conta2 = new Conta();
        conta2.setAgencia("AAAAAAAAAAAAAA");
        conta2.setNomeTitular("Sicrano");
        conta2.setNumero("BBBBBBBBBBBBBB");
        conta2.setSaldo(30000);
        
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(conta);
        contas.add(conta2);

        relatorioComp.imprime(contas);
        relatorioSimp.imprime(contas);

    }

    private static void testarTemplateMethod(){

        Orcamento orcamento = new Orcamento();
        Item item1 = new Item();
        item1.setNome("Violão");
        item1.setValor(490);

        Item item2 = new Item();
        item2.setNome("LAPIS");
        item2.setValor(10);

        Item item3 = new Item();
        item3.setNome("CANETA");
        item3.setValor(15);

        orcamento.getItens().add(item1);
        orcamento.getItens().add(item2);
        orcamento.getItens().add(item3);

        ImpostoX impostoX = new ImpostoX();
        ImpostoY impostoY = new ImpostoY();
        ImpostoZ impostoZ = new ImpostoZ();

        double valorImpostoX = impostoX.calcula(orcamento);
        double valorImpostoY = impostoY.calcula(orcamento);
        double valorImpostoZ = impostoZ.calcula(orcamento);

        System.out.println("Valor impostoX: "+valorImpostoX);
        System.out.println("Valor impostoY: "+valorImpostoY);
        System.out.println("Valor impostoZ: "+valorImpostoZ);


    }


    private static void testarStrategy() {

        Conta conta = new Conta();
        conta.setSaldo(10000);
        // Investimento estrategia = new Arrojado();
        Investimento estrategia = new Arrojado();

        for (int i = 0; i < 11; i++) {
            RealizadorDeInvestimentos.investirSaldo(conta, estrategia);

        }

    }

    private static void testarChainOfResponsibility() {

        CalculadoraDeDescontos calculador = new CalculadoraDeDescontos();

        Orcamento orcamento = new Orcamento();
        Item item1 = new Item();
        item1.setNome("Violão");
        item1.setValor(400);

        Item item2 = new Item();
        item2.setNome("LAPIS");
        item2.setValor(10);

        Item item3 = new Item();
        item3.setNome("CANETA");
        item3.setValor(15);

        orcamento.getItens().add(item1);
        orcamento.getItens().add(item2);
        orcamento.getItens().add(item3);

        double desconto = calculador.calculaDesconto(orcamento);

        System.out.println("Valor do desconto = R$ " + desconto);

    }

    private static void testarChainOfResponsibilityExercise() {

        Requisicao requisicao = new Requisicao();

        Conta conta = new Conta();
        conta.setNomeTitular("Emmanuel");
        conta.setSaldo(20000);


        requisicao.formataDadosConta(conta, "xml");
        requisicao.formataDadosConta(conta, "csv");
        requisicao.formataDadosConta(conta, "%");
        requisicao.formataDadosConta(conta, "");


    }

}
