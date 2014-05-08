import cv.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.util.JAXBSource;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;
import java.util.Map;


/**
 * Created by matekordial on 06/05/2014.
 */

public class PutRequest {
    private Service service;
    private JAXBContext jc;

    private static final QName qname = new QName("", "");
    private static final String url = "http://localhost:8080/SpringMVC/rest/Resume";

    public PutRequest() {
        try {
            jc = JAXBContext.newInstance(Resume.class, Experiences.class,
                    Competences.class, ResumeLangue.class , String.class);
        } catch (JAXBException je) {
            System.out.println("Cannot create JAXBContext " + je);
        }
    }
    public void addResume(Resume resume) throws JAXBException {
        service = Service.create(qname);
        service.addPort(qname, HTTPBinding.HTTP_BINDING, url);
        Dispatch<Source> dispatcher = service.createDispatch(qname,
                Source.class, Service.Mode.MESSAGE);
        Map<String, Object> requestContext = dispatcher.getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_METHOD, "PUT");

        Source result = dispatcher.invoke(new JAXBSource(jc, resume));

    }



}
