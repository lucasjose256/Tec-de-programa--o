/**
 * The main part of the calculator doing the calculations.
 * 
 * @author  David J. Barnes and Michael Kolling 
 * @version 2008.03.30
 */
public class CalcEngine
{
  
    //Será utilizado para verificar se existe um valor no display,ou 
    // o numéro selcionado será o primeiro
    private boolean buildingDisplayValue;
  

    // O valor a ser mostrado no visor
    private int displayValue;

    private int valueAfterOperand;
    private int valueBeforeOperand;
    //plus e minus serão flags, para identificar se determidado operador foi precionado
    private boolean plus;
    private boolean minus;

    public CalcEngine(){
           valueBeforeOperand=0;
           valueAfterOperand=0;
           buildingDisplayValue = false;
           plus=false;
           displayValue = 0;
           minus=false;
    }

    
    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public int getDisplayValue()
    {
        return displayValue;
        

    }

    public void numberPressed(int number)
    {       //Verifica se já existe digitos no visor
        if(buildingDisplayValue) {
            // Incorporata o numero
            displayValue = displayValue*10 + number;
            //verifica se algum operdor ja foi selcionado,com o objetivo que colocar o valor
            //depois dele na variável valueAfterOperand;
            if(plus || minus){valueAfterOperand=number;}
            //se nenhum operador foi selecionado,então o dígito é colocado na variável a seguir
            else {valueBeforeOperand=number;}
        }
        else {
            // Cria um novo display

            valueBeforeOperand = number;
            buildingDisplayValue = true;
        }


    }

   
    public void plus()
    {
        plus=true;
    }

    
    public void minus()
    {
        minus=true;
    }

    //quando o botão "=" é precionado,começa a lógica entre os numéros e o operador selecionado 
    public void equals()
    {
        if(plus==true){
           displayValue= valueBeforeOperand+valueAfterOperand;
           plus=false;
           valueAfterOperand=0;
           valueBeforeOperand=0;
           buildingDisplayValue=false;

        }
        else if(minus==true){

        displayValue= valueBeforeOperand-valueAfterOperand ;    
        minus=false;
        valueAfterOperand=0;
        valueBeforeOperand=0;
        buildingDisplayValue=false;
        }

    }

    //O botao C foi precionado
    public void clear()
    {
        
        buildingDisplayValue = false;
        displayValue = 0;
        valueAfterOperand=0;
        valueBeforeOperand=0;
        minus=false;
        plus=false;

    }

    public String getTitle()
    {
        return "Calculadora JAVA";
    }

    
    public String getAuthor()
    {
        return "Lucas José Barszcz";
    }


    public String getVersion()
    {
        return "Versao 2.4";
    }

}

