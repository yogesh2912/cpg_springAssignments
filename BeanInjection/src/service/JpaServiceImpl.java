package service;

import dao.JpaDaoImpl;

public class JpaServiceImpl implements Iservice{
		private JpaDaoImpl jpaObj;
		
		

		public JpaServiceImpl() {
			super();
			System.out.println("jpa constructor service");
		}

		public JpaDaoImpl getJpaObj() {
			return jpaObj;
		}

		public void setJpaObj(JpaDaoImpl jpaObj) {
			this.jpaObj = jpaObj;
		}

		@Override
		public String getType() {
			// TODO Auto-generated method stub
			return jpaObj.type();
		}
		
}
