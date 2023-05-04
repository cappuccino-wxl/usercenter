import { PageHeaderWrapper } from '@ant-design/pro-components';
import React from 'react';

// 引用了Admin/UserManage页面
const Admin: React.FC = (props) => {
  const { children } = props;
  return <PageHeaderWrapper>{children}</PageHeaderWrapper>;
};

export default Admin;
