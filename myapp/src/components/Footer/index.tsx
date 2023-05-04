import { PLANET_LINK } from '@/constants';
import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';

const Footer: React.FC = () => {
  const defaultMessage = 'Cabbuccino出品';

  const currentYear = new Date().getFullYear();

  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'Ant Design Pro',
          title: '知识星球',
          href: PLANET_LINK,
          blankTarget: true,
        },
        {
          key: 'Ant Design',
          title: '编程导航',
          href: 'https://www.code-nav.cn/',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined />
              Cabbuccino Github
            </>
          ),
          href: 'https://github.com/cappuccino-wxl',
          blankTarget: true,
        },
      ]}
    />
  );
};

export default Footer;
