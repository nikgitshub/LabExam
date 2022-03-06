package springMVCFirst.initializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import springMVCFirst.Config.AppConfigurator;
public class SpringWebInitializer implements WebApplicationInitializer
{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException
	{
		AnnotationConfigWebApplicationContext springContext=new AnnotationConfigWebApplicationContext();
		springContext.register(AppConfigurator.class);
		springContext.setServletContext(servletContext);
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",new DispatcherServlet(springContext));
		servlet.addMapping("/spring/*");
		servlet.setLoadOnStartup(10);
	}
}
