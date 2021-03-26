package co.com.claro.qdn.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.faces.context.FacesContext;
import net.telmex.util.StringUtil;

/**
 *
 * @author acastanv
 * @author lramiria
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
public class EJButil {
    
    /**
     * 
     * @param <T>
     * @param obj1
     * @param obj2
     * @return T
     * @throws Exception 
     */
    public static <T> T  mapperEntityAndDao (T obj1, T obj2)throws Exception{
        T valorParam = obj2;     
        Class claseOut = obj1.getClass();
        Class claseIn = obj2.getClass();
        Field[] atributos= claseIn.getDeclaredFields();        
        for(Field field: atributos){
            if(!field.getName().equals("entityManager")){
                if(!field.getName().equals("serialVersionUID")){
                    if(!field.getName().contains("_")){
                        Method getMethod = claseIn.getMethod("get" + StringUtil
                                .toCamelCase(field.getName()));
                        Object value = getMethod.invoke(valorParam);       
                        if(value instanceof String || value instanceof Long ||
                                value instanceof Short || value instanceof Date 
                                || value instanceof BigInteger || value 
                                instanceof Integer|| value instanceof 
                                Character){    
                            Method setMethod = claseOut.getDeclaredMethod("set"
                                    + StringUtil.toCamelCase(field.getName())
                                    , value.getClass());
                            setMethod.invoke(obj1, value);
                        }                                     
                    }
                }
            }
        }
        return  obj1;
    }
    
    /**
     * 
     * @param key
     * @return Object
     */
    public static Object getDataSession(String key)
    {
        return
            FacesContext
            .getCurrentInstance()
            .getExternalContext()
            .getSessionMap()
            .get(key);
    }

    /**
     * 
     * @param key
     * @param obj 
     */
    public static void setDataSession(String key, Object obj)
    {
        FacesContext
        .getCurrentInstance()
        .getExternalContext()
        .getSessionMap()
        .put(key, obj);
    }

    /**
     * 
     * @param key 
     */
    public static void removeDataSession(String key)
    {
        FacesContext
        .getCurrentInstance()
        .getExternalContext()
        .getSessionMap()
        .remove(key);
    }
    
    /**
     * 
     * @param list
     * @return boolean
     */
    public static boolean isListNull(Collection list)
    {
        return !(list != null && !list.isEmpty());
    }
    
    /**
     * 
     * @param str
     * @return boolean
     */
    public static boolean isNull(String str)
    {
        return !(str != null && (!str.equals("")));
    }
    
    /**
     * 
     * @param dato
     * @return boolean
     */
    public static boolean isNull(Date dato){
        return !(dato != null);
    }
    
    /**
     * 
     * @param dato
     * @return boolean
     */
    public static boolean isNull(Character dato)
    {
        return !(dato != null);
    }    
    
    /**
     * 
     * @param dato
     * @return boolean
     */
    public static boolean isNull(Long dato){
        return !(dato!=null && dato>0);
    }
    
    /**
     * 
     * @param dato
     * @return boolean
     */
    public static boolean isNullState(Long dato){
        return !(dato!=null);
    }
    
    
}
