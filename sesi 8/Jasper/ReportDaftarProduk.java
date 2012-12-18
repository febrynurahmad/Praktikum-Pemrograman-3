package belajar.report;

import java.io.InputStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ReportDaftarProduk{
	private static String templateReport
		= "/DaftarProduk.jrxml";

	public static void main(String[] xx) throws Exception {
		// 1. Load template
		InputStream template = 
			ReportDaftarProduk.class
			.getResourceAsStream(templateReport);

		JasperDesign jd = JRXmlLoader.load(template);

		// 2. Compile
		JasperReport report 
			= JasperCompileManager.compileReport(jd);

		// 3. Isi data
		List<Produk> daftarProduk = buatSampleData();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tahun", 2012);

		JasperPrint jrprint = 
				JasperFillManager.fillReport(report,
                params, 
                new JRBeanCollectionDataSource(
                	daftarProduk));

		// 4. Export
		JRPdfExporter exporter = new JRPdfExporter();
				
		exporter.setParameter(
			JRExporterParameter.JASPER_PRINT, 
			jrprint);

		exporter.setParameter(
			JRExporterParameter.OUTPUT_FILE_NAME, 
			"target/DemoDaftarProduk-pdf");
		
		exporter.exportReport();
	}

	private static List<Produk> buatSampleData(){
		// nantinya ini query dari database
		List<Produk> hasil = new ArrayList<Produk>();

		Produk p1 = new Produk();
		m1.setKode("P-001");
		m1.setNama("Mouse Logitech");
		m1.setHarga(new BigDecimal("150.000,00"));
		hasil.add(p1);
		
		Produk p2 = new Produk();
		m1.setKode("P-002");
		m1.setNama("USB Flashdisk 2GB");
		m1.setHarga(new BigDecimal("50.000,00"));
		hasil.add(p2);

		Produk p3 = new Produk();
		m1.setKode("P-003");
		m1.setNama("Laptop Acer");
		m1.setHarga(new BigDecimal("10.000.000,00"));
		hasil.add(p3);

		

		return hasil;

	}
}