import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Header } from './components/header/Header'
function App() {
  return (
    <div className="App">
      <div>
        <Header />
        <a href="https://vitejs.dev" target="_blank">
          <p>meow meow</p>
        </a>
      </div>
    </div>
  )

}
export default App
