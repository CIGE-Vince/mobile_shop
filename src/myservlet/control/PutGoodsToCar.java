package myservlet.control;
import mybean.data.Login;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PutGoodsToCar extends HttpServlet {
   public void init(ServletConfig config) throws ServletException { 
      super.init(config);
   }
   public  void  doPost(HttpServletRequest request,HttpServletResponse response) 
                        throws ServletException,IOException {
      request.setCharacterEncoding("gb2312");
      String goods = request.getParameter("java");
      Login loginBean=null;
      HttpSession session=request.getSession(true);
      try{  loginBean=(Login)session.getAttribute("loginBean");
            boolean b =loginBean.getLogname()==null||
            loginBean.getLogname().length()==0;
            if(b)
              response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
            LinkedList<String> car = loginBean.getCar();
            car.add(goods);
            speakSomeMess(request,response,goods); 
      }
      catch(Exception exp){
           response.sendRedirect("login.jsp");//�ض��򵽵�¼ҳ��
      }
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException {
      doPost(request,response);
   }
   public void speakSomeMess(HttpServletRequest request,
                     HttpServletResponse response,String goods) throws IOException {
	   response.sendRedirect("success.jsp");
//       response.setContentType("text/html;charset=gb2312");
//        try 
//         PrintWriter out=response.getWriter();
//         out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />" );
//         out.print("<html>");
//         out.print("<head><%@ include file=head.txt%></head>");
//         out.println("<body>");
//         out.println("<h2>"+goods+"���빺�ﳵ</h2>") ;
//         out.println("�鿴���ﳵ�򷵻�<br>");
//         out.println("<a href =lookShoppingCar.jsp>�鿴���ﳵ</a>");
//         out.println("<br><a href =byPageShow.jsp>��ҳ</a>");
//         out.println("</body></html>");
//        }
//        catch(IOException exp){}
   }
}
