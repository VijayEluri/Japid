package japidviews._layouts;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
import static cn.bran.play.PlayTemplateVarsAdapter.*;
// NOTE: This file was generated from: japidviews/_layouts/Layout.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public abstract class Layout extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_layouts/Layout.html";
	public static final String contentType = "text/html";
static String static_0 = "I'm the layout.\n" + 
"<p>\n" + 
"";
static String static_1 = ";\n" + 
"</p>\n" + 
"<div>\n" + 
"";
static String static_2 = "\n" + 
"</div>\n" + 
"\n" + 
"\n" + 
"";
	public Layout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {		p(static_0);// line 1
	title();// line 3
p(static_1);// line 3
	doLayout();// line 6
p(static_2);// line 6
	}	protected abstract void title();
	protected abstract void doLayout();
}