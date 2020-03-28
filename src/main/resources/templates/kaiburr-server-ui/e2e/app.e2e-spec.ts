import { KaiburrServerUiPage } from './app.po';

describe('kaiburr-server-ui App', function() {
  let page: KaiburrServerUiPage;

  beforeEach(() => {
    page = new KaiburrServerUiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
