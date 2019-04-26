/**
 * Class containing the parser for the 
 * @author Phil
 *
 */

import java.io.*; //buffered reader
import java.util.Arrays; //potential use for array manipulation


public class EulerParser {

	private File f;	//file to be read from
	private BufferedReader reader; //reader
	
	
	/*
	 * interface methods
	 */
	public void fileOpen(File newFile){
		
		open(newFile);
	}
	
	public void closeFile(){
		
		close();
	}
	
	public void readFile(){
		
		read();
	}
	
	/*
	 * action methods
	 */
	
	//open the reader
	private void open(File newFile)	{
		
		reader = null; //null initialize
		f = newFile;
		
		try{
			
			reader = new BufferedReader(new FileReader(f));
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void read(){
		
	}
	
	//close the reader
	private void close(){
		
		try{
			
			reader.close();
		} catch (Exception e){
			
			e.printStackTrace();
		}
	}
}
