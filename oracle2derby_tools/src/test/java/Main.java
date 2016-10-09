

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.parsing.XPathParser;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avn.core.StepEntity;
import com.avn.model.Catentry;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

@SuppressWarnings("all")
public class Main {
	
	static final Logger log = Logger.getLogger(Main.class);
	
	public static void testMybatisConf() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:derby-ds-config.xml");
		SqlSession session = (SqlSession)appContext.getBean("sqlSession");
		Catentry catentry = (Catentry)session.selectOne("com.avn.mapper.CatentryMapper.selectByPrimaryKey", 10001L);
		log.info(catentry.getMfpartnumber());
		org.apache.ibatis.session.Configuration conf = session.getConfiguration();
		System.out.println(conf.getMapperRegistry());
	}
	
	public static void mapperParser() {
		try {
			InputStream mapperXml = new FileInputStream("D:/eclipse/mars1/workspace/codeGenerator/target/classes/com/avn/mapper/CatentryMapper.xml");
			XPathParser parser = new XPathParser(mapperXml);
			XNode xnode = parser.evalNode("/mapper");
			log.info(xnode);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void generateXML() {
		Configuration cfg = new Configuration();
		try {
			cfg.setDirectoryForTemplateLoading(new File("D:\\eclipse\\mars1\\workspace\\codeGenerator\\src\\main\\resources\\"));
			cfg.setObjectWrapper(new DefaultObjectWrapper());
			Template template = cfg.getTemplate("step.ftl");
			Map<String, StepEntity> stepPros = createDataModel();
			File generatedCfg = new File("./test.xml");
			Writer cfgWriter = new FileWriter(generatedCfg);
			template.process(stepPros, cfgWriter);
			cfgWriter.flush();
			cfgWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		mapperParser();
//		testMybatisConf();
		generateXML();
	}
	
	private static Map createDataModel() {
		Map<String, StepEntity> props = new HashMap<String, StepEntity>();
		StepEntity step = new StepEntity();
		step.setDataSource("oracleDS");
		step.setTableName("CATENTRY");
		step.setColumnList("CATENTRY_ID,MEMBER_ID,ITEMSPC_ID,CATENTTYPE_ID,PARTNUMBER,MFPARTNUMBER,MFNAME,MARKFORDELETE,URL,FIELD1,FIELD2,LASTUPDATE,FIELD3,ONSPECIAL,ONAUCTION,FIELD4,FIELD5,BUYABLE,OID,BASEITEM_ID,STATE,STARTDATE,ENDDATE,RANK,OPTCOUNTER,AVAILABILITYDATE,LASTORDERDATE,ENDOFSERVICEDATE,DISCONTINUEDATE");
		step.setSortKey("CATENTRY_ID");
		props.put("step", step);
		return props;
	}

}
