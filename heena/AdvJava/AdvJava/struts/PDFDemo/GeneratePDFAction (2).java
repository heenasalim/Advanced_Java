
package pk1;


import java.io.*;

import com.lowagie.text.Document;

import com.lowagie.text.Paragraph;

import com.lowagie.text.pdf.PdfWriter;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ModelDriven;

public class GeneratePDFAction extends ActionSupport implements ModelDriven {

MessageInPDF obMessage;

public String execute() throws Exception {

String string = obMessage.getMessage();

Document document = new Document();

PdfWriter.getInstance(document, new FileOutputStream(

"D:\\StrutsExample.pdf"));

document.open();

document.add(new Paragraph(string));

document.close();

return SUCCESS; }

@Override

public Object getModel() {

obMessage = new MessageInPDF();

// TODO Auto-generated method stub

return obMessage; }

} 
