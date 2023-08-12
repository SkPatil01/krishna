package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ModelLayer.Register;

public class ExcelDataReader {
public static List<Register> getData(String fileName ,int index) throws IOException{
	String path=System.getProperty("user.dir")+"src\\test\\resources"+fileName;
	
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	List<Register>list=new ArrayList();
	
	XSSFSheet sheet=workbook.getSheetAt(index);
	XSSFRow row=sheet.getRow(0);
    Register reg=new Register();
    
    reg.setFirstName(row.getCell(0).toString());
    reg.setLastName(row.getCell(1).toString());
    reg.setPhone(row.getCell(2).toString());
    reg.setEmail(row.getCell(3).toString());
    reg.setAddress1(row.getCell(4).toString());
    reg.setCity(row.getCell(5).toString());
    reg.setState(row.getCell(6).toString());
    reg.setPostalCode(row.getCell(7).toString());
    reg.setUserName(row.getCell(8).toString());
    reg.setPassword(row.getCell(9).toString());
    reg.setConfirmPassword(row.getCell(10).toString());
    list.add(reg);
    return list;
	
	
}
}
