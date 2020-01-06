import React, { Component } from 'react';
import { Nav, Navbar, NavDropdown } from "react-bootstrap";
import MapApp from './component/MapApp'
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="root">
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark" className="Navbar">
          <Navbar.Brand href="/">Where To Meet</Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="mr-auto">
            <Nav.Link href="/aboutus">About Us</Nav.Link>
          </Nav>
          <Nav>
            <Nav.Link href="/signup">Sign Up</Nav.Link>
          </Nav>
          </Navbar.Collapse>
        </Navbar>
        <MapApp />
      </div>
    );
  }
}

export default App;
