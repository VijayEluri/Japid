//version: 0.9.37
package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import cn.bran.japid.template.ActionRunner;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
//
// NOTE: This file was generated from: japidviews/Application/hellohelloTag.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class hellohelloTag extends cn.bran.play.JapidTemplateBase
{
	public static final String sourceTemplate = "japidviews/Application/hellohelloTag.html";
	 private void initHeaders() {
		putHeader("Content-Type", "text/html; charset=utf-8");
		setContentType("text/html; charset=utf-8");
	}
	{
	}

// - add implicit fields with Play

	final play.mvc.Http.Request request = play.mvc.Http.Request.current(); 
	final play.mvc.Http.Response response = play.mvc.Http.Response.current(); 
	final play.mvc.Scope.Session session = play.mvc.Scope.Session.current();
	final play.mvc.Scope.RenderArgs renderArgs = play.mvc.Scope.RenderArgs.current();
	final play.mvc.Scope.Params params = play.mvc.Scope.Params.current();
	final play.data.validation.Validation validation = play.data.validation.Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public hellohelloTag() {
	super((StringBuilder)null);
	initHeaders();
	}
	public hellohelloTag(StringBuilder out) {
		super(out);
		initHeaders();
	}
	public hellohelloTag(cn.bran.japid.template.JapidTemplateBaseWithoutPlay caller) {
		super(caller);
	}

/* based on https://github.com/branaway/Japid/issues/12
 */
	public static final String[] argNames = new String[] {/* args of the template*/"i",  };
	public static final String[] argTypes = new String[] {/* arg types of the template*/"int",  };
	public static final Object[] argDefaults= new Object[] {null, };
	public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.Application.hellohelloTag.class);

	{
		setRenderMethod(renderMethod);
		setArgNames(argNames);
		setArgTypes(argTypes);
		setArgDefaults(argDefaults);
		setSourceTemplate(sourceTemplate);
	}
////// end of named args stuff

	private int i; // line 1, japidviews/Application/hellohelloTag.html
	public cn.bran.japid.template.RenderResult render(int i) {
		this.i = i;
		try {super.layout();} catch (RuntimeException __e) { super.handleException(__e);} // line 1, japidviews/Application/hellohelloTag.html
		return getRenderResult();
	}

	public static cn.bran.japid.template.RenderResult apply(int i) {
		return new hellohelloTag().render(i);
	}

	@Override protected void doLayout() {
		beginDoLayout(sourceTemplate);
;// line 1, hellohelloTag.html
		;// line 1, hellohelloTag.html
				actionRunners.put(getOut().length(), new cn.bran.play.CacheablePlayActionRunner("", Application.class, "echo", i) {
			@Override
			public void runPlayAction() throws cn.bran.play.JapidResult {
				Application.echo(i); // line 2, hellohelloTag.html
			}
		}); p("\n");// line 2, hellohelloTag.html
		;// line 2, hellohelloTag.html
		
		endDoLayout(sourceTemplate);
	}

}