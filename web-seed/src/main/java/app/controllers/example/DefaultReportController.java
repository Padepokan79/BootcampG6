package app.controllers.example;

import java.util.Map;

import org.javalite.common.JsonHelper;
import org.javalite.common.Util;

import core.javalite.controllers.ReportController;

public class DefaultReportController extends ReportController {
	
	public DefaultReportController() {
		super("report-design/TestReport.jrxml");
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getData() throws Exception {
		// Hanya contoh jika seandainya data dikirim dari FE berupa JSON
		String data = Util.read(getRequestInputStream());
		
		System.out.println("Data :" + data);
		return JsonHelper.toMap(data);
	}
}