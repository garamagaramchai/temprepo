class CommandLineArgumentException extends Exception{
    public CommandLineArgumentException(String message){
        super(message);
    } 
}

class practice{
    public static void main(String args[]){
        try{
            if(args.length<2){
                throw new CommandLineArgumentException("less arguments");
            }
            else if(args.length>5){
                throw new CommandLineArgumentException("more arguments");
            }
            for(int i=0;i<args.length;i++){
                if(args[i].getClass()) throw new CommandLineArgumentException("hehe");
            }
        }
        catch(CommandLineArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally");
        }
    }
}