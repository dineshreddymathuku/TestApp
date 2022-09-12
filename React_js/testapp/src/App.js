import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router ,Route,Routes} from 'react-router-dom';
import ListEmployeeComponents from './components/ListEmployeeComponents';
import FooterComponent from './components/FooterComponent';
import HeaderComponent from './components/HeaderComponent';
import CreateNewEmployee from './components/CreateNewEmployee';

function App() {
  return (
  <>
  <div>
    <Router>
        <HeaderComponent />
          <div className='container'>
            <Routes>
                <Route path={"/"} exact element ={<ListEmployeeComponents />}></Route>
                <Route path={"/getAll"} element ={<ListEmployeeComponents />}></Route>
                <Route path={"/addEmployee"} element ={<CreateNewEmployee />}></Route>
            </Routes>
          </div>
        <FooterComponent />
    </Router>
  </div>
  </>
  );
}

export default App;
