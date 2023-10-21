package myapplication;

public class Main {

	static String prometheusUrl = "";
	static String service_name = "";
	static {

		prometheusUrl = System.getenv("PROM_URL");
		if (prometheusUrl == null) {
			prometheusUrl = "http://prom-prometheus-operator-prometheus.monitoring:9090/api/v1/query?/";
		}

		service_name = System.getenv("service_name");
		if (service_name == null) {
			service_name = "service.service-system";
		}

		System.out.println("prometheusUrl: " + prometheusUrl);
		System.out.println("service_name: " + service_name);
	}

	public static void main(String[] args) {

		System.out.println("Main executed!");
		// StringCleaner sc = new StringCleaner();
		// sc.exec();

	}

}