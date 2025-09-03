import logo from './logo.svg';
import './App.css';
import Customer from './cus/customer';
import Product from './prd/product';
import Sidebar from './components/sidebar';
import ViewCustomer from './cus/viewCustomer';
import AddCustomer from './cus/addCustomer';
import { Route, Routes, BrowserRouter as Router } from 'react-router-dom';
import { Provider } from 'react-redux';
import Login from './components/login/login';

function App() {


  return (
    <>
    
    
    <div className="App">
      
      <div>
        <Sidebar/>
      </div>
      <br/>Products Ordered by Customers
      <Router>
        <Routes>
          
          <Route path='login' element={<Login/>}/>
          <Route path='customer' element={<Customer/>}/>
          <Route path='product' element={<Product/>}/>
        </Routes>
      </Router>
    </div>
    </>
  );
}

export default App;
