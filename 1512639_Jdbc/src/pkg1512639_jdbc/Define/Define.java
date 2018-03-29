/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_jdbc.Define;

/**
 *
 * @author phamanhtuan
 */
public class Define {
    
    public static final int NUMBER_SUB_PANEL_ITEM = 4;
    public static class TableName{
        public static final String STUDENT_INFOR = "StudentInfor";
    }
    public static class StudentTableAttribute{
        
        public static final String ID       = "MaHS";
        public static final String NAME     = "TenHS";
        public static final String BIRTHDAY = "NgaySinh";
        public static final String NOTE     = "GhiChu";
        public static final String AVARTAR  = "ExInfor";
    }
    
    public static class  SQLQuery{
        
        public static final String SELECT_STUDENT_INFOR_TABLE = "select * from " + Define.TableName.STUDENT_INFOR + " ";
        
        public static final String INSERT_INTO_STUDENT_INFOR_TABLE = "insert into " + Define.TableName.STUDENT_INFOR + " ("+Define.StudentTableAttribute.ID+ "," +
                                                                                                                            Define.StudentTableAttribute.NAME + "," +
                                                                                                                            Define.StudentTableAttribute.BIRTHDAY + "," +
                                                                                                                            Define.StudentTableAttribute.NOTE + "," + 
                                                                                                                            Define.StudentTableAttribute.AVARTAR + ") " + 
                                                                     "values (?,N?,?,?,?)";
        
        public static final String GET_STUDNET_AVART_BY_ID       = " select " + Define.StudentTableAttribute.AVARTAR + " from " + Define.TableName.STUDENT_INFOR + " "
                                                                  +" where " + Define.StudentTableAttribute.ID + " = ?";
        
        public static final String UPDATE_STUENT_AVARTAR_BY_ID   = " update  " + Define.TableName.STUDENT_INFOR +
                                                                   " set "     + Define.StudentTableAttribute.AVARTAR + " =  ? " +
                                                                   " where "   + Define.StudentTableAttribute.ID      + " =  ? "  ;
        
        public static final String UPDATE_STUDENT_NAME_BY_ID     = " update " + Define.TableName.STUDENT_INFOR    +
                                                                   " set "    + Define.StudentTableAttribute.NAME + " = ? " +
                                                                   " where "  + Define.StudentTableAttribute.ID   + " = ?";
        
        public static final String UPDATE_STUDENT_BIRTHDAY_BY_ID = " update " + Define.TableName.STUDENT_INFOR + 
                                                                   " set "    + Define.StudentTableAttribute.BIRTHDAY + " = ? " + 
                                                                   " where "  + Define.StudentTableAttribute.ID + " = ?";
        
        public static final String UPDATE_STUDNET_NOTE_BY_ID     = " update " + Define.TableName.STUDENT_INFOR    + 
                                                                   " set "    + Define.StudentTableAttribute.NOTE + " = ? " +
                                                                   " where "  + Define.StudentTableAttribute.ID   + " = ? "; 
    }
    public static  class DatabaseInfor{
        public static String SERVER_NAME = "localhost";
        public static String DATABASE_NAME = "Student";
        public static String DATABASE_PORT_NUMBER = "3306";
        public static String DATABASE_USER_NAME = "root";
        public static String DATABASE_PASSWORD = "1anhtuan";
    }
    
    public enum ResearchType{
        STUDENT_NAME,
        STUDENT_ID,
        STUDENT_BIRTHDAY,
        STUDENT_NOTE
    }
    
    //public String insert
}
