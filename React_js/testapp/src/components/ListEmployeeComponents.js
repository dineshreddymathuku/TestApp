import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import EmployeeServices from '../services/EmployeeServices';

class ListEmployeeComponents extends Component {
    constructor(props) {
        super(props)
        this.state={
            employee: []
        }
        this.addEmployee = this.addEmployee.bind(this);
    }
    componentDidMount(){
        EmployeeServices.getEmployees().then((res)=>{
            this.setState({employee: res.data});
        });
    }
    addEmployee(){
        this.props.history.push('/addEmployee');
    }
    render() {
        return (
            <div>
                <h2 className='text-center'>Employee List</h2>
                <div className='row'>
                    <Link to={"/addEmployee"}>
                    <button className='btn btn-primary'>Add Employee</button></Link>
                </div>
                <div className='row'>
                    <table className='table table-stripped table-bordered'>
                        <thead>
                            <tr>
                                <th>Employee FirstName</th>
                                <th>Employee LastName</th>
                                <th>EmailId</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                           {
                            this.state.employee.map(
                                employee =>
                                <tr key={employee.id}>
                                    <td>{employee.firstName}</td>
                                    <td>{employee.lastName}</td>
                                    <td>{employee.emailId}</td>

                                </tr>
                            )
                           }
                        </tbody>

                    </table>

                </div>
            </div>
        );
    }
}

export default ListEmployeeComponents;