	import java.io.*;
	import java.net.Socket;
	import java.util.Scanner;

public class Client {
	
	    private Socket socket;
	    private BufferedReader bufferedReader;
	    private BufferedWriter bufferedWriter;
	    private String username;


	    public Client(Socket socket, String username){
	        try{
	            this.socket = socket;
	            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	            this.username = username;
	        }catch(IOException ex){
	            closeEverything(socket, bufferedReader, bufferedWriter);
	        }
	    }


	    public void sendMessage(){
	        try {
	            bufferedWriter.write(username);
	            bufferedWriter.newLine();

	            Scanner scanner = new Scanner(System.in);

	            while (socket.isConnected()){
	                String messageToSend = scanner.nextLine();
	                bufferedWriter.write(username + ": " + messageToSend);
	                bufferedWriter.newLine();
	                bufferedWriter.flush();
	            }
	        }catch (IOException ex){
	            closeEverything(socket, bufferedReader, bufferedWriter);
	        }
	    }

	    public void listenForMessage(){
	        new  Thread(new Runnable() {
	            @Override
	            public void run() {
	                String messageFromGroupChat;

	                while (socket.isConnected()){
	                    try {
	                        messageFromGroupChat = bufferedReader.readLine();
	                        System.out.println(messageFromGroupChat);
	                    }catch (IOException ex){
	                        closeEverything(socket, bufferedReader, bufferedWriter);
	                    }
	                }
	            }
	        }).start();
	    }


	    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
	        try {
	            if(socket != null){
	                socket.close();
	            }

	            if(bufferedReader != null){
	                bufferedReader.close();
	            }

	            if(bufferedWriter != null){
	                bufferedWriter.close();
	            }
	        }catch (Exception ex){
	            ex.printStackTrace();
	        }
	    }

	    public static void main(String[] args)throws IOException{
	      Scanner scanner = new Scanner(System.in);

	      System.out.println("ENter your username: ");
	      String username = scanner.nextLine();

	      Socket socket = new Socket("192.168.137.204", 1234);
	      Client client = new Client(socket, username);
	      
	      client.listenForMessage();
	      client.sendMessage();
	    }
}
